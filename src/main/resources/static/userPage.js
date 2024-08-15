document.addEventListener('DOMContentLoaded', (event) => {
    fetchUser(); // Вызов функции после загрузки DOM
});

const userurl = '/api/user';

async function fetchUser() {
    try {
        const response = await fetch(userurl);
        if (!response.ok) {
            throw new Error(`HTTP error! status: ${response.status}`);
        }
        const user = await response.json();
        console.log('User data fetched:', user);

        document.getElementById('username').textContent = user.username;
        document.getElementById('shortRoles').textContent = user.roles.map(role => role.role.replace("ROLE_", "")).join(', ');

        getInformationAboutUser(user);
    } catch (error) {
        console.error('Error fetching user data:', error);
        alert('Failed to fetch user data.');
    }
}

function getInformationAboutUser(user) {
    const tableBody = document.getElementById('usertbody');
    let dataHtml = '';
    let roles = user.roles.map(role => role.role.replace("ROLE_", "")).join(', ');

    dataHtml =
        `<tr>
            <td>${user.id}</td>
            <td>${user.email}</td>
            <td>${user.name}</td>
            <td>${user.company}</td>
            <td>${roles}</td>
        </tr>`;

    tableBody.innerHTML = dataHtml;
}