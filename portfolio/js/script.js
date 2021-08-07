import {
    getData,
    querySelector
} from './utilities.js'


//Selectors
const contactInfo = querySelector('.contact-info');
const projectlist = querySelector('.project');
const skillset = querySelector('.skills');
const skillContainer = querySelector('.skill-container');
const projectContainer = querySelector('.project-container');


//generate contact information
getData("contact").then(function (data) {
    let info = data.contact;
    return info.map(function (contact) {

        const item = document.createElement("div");
        item.setAttribute('class', 'me')

        item.innerHTML =
            `
        <div class="image">
            <img src=${contact.imgpath} alt="Jersen">
        </div>
        <div class="info">
            <p>${contact.name}</p>
            <p>${contact.email}</p>
            <p>${contact.contactNumber}</p>
            <p><a target="_blank" href="${contact.linkedin}">LinkedIn Profile</a></p>
            <p><a target="_blank" href="${contact.facebook}">Facebook Page</a></p>
            <p><a target="_blank" href="${contact.behance}">Behance</a></p>
        </div>
        `;

        contactInfo.appendChild(item);

    })
});

//generate project file
getData("projects").then(function (data) {
    let project = data.projects;
    const titleContainer = document.createElement('div')
    titleContainer.setAttribute('class', 'title-container');
    const title = document.createElement('p');
    title.innerHTML = 'Web Development Projects >'

    return project.map(function (projects) {
        const item = document.createElement("div");
        item.setAttribute('class', 'item')
        item.innerHTML =
            `
        <div class="image">
            <img src=${projects.imgpath} alt=${projects.alt}>
        </div>
        <div class="desc">
        <p>${projects.description}</p>
        <a target="_blank" href="${projects.link}">${projects.call}</a> 
        </div>  
        `;
        titleContainer.appendChild(title);
        projectContainer.appendChild(item);
        projectlist.appendChild(titleContainer);
        projectlist.appendChild(projectContainer);
    })
});


//generate skills 
getData("skills").then(function (data) {
    let skill = data.skills;
    const titleContainer = document.createElement('div')
    titleContainer.setAttribute('class', 'title-container');
    const title = document.createElement('p');
    title.innerHTML = 'Web Development Skills >'


    return skill.map(function (skills) {
        const item = document.createElement("div");
        item.setAttribute('class', 'item')
        item.innerHTML =
            `
        <div class="image">
            <img src=${skills.imgpath} alt=${skills.alt}>
        </div>
       
        <p>${skills.description}</p>
        
        `;
        titleContainer.appendChild(title);
        skillContainer.append(item);
        skillset.appendChild(titleContainer);
        skillset.appendChild(skillContainer);
    })
});