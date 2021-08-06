import {
    getData,
    querySelector
} from './utilities.js'


//Selectors
const contactInfo = querySelector('.contact-info');
const projectlist = querySelector('.project');
const skillset = querySelector('.skills');


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
        </div>
        `;

        contactInfo.appendChild(item);

    })
});

//generate project file
getData("projects").then(function (data) {
    let project = data.projects;
    return project.map(function (projects) {
        const item = document.createElement("div");

        item.innerHTML =
            `
        <div class="image">
            <img src=${projects.imgpath} alt=${projects.alt}>
        </div>
        <div class="desc">
        <p>${projects.description}</p>
        <a href="${projects.link}">${projects.name}</a> 
        </div>  
        `;
        projectlist.appendChild(item);
    })
});


//generate skills 
getData("skills").then(function (data) {
    let skill = data.skills;
    return skill.map(function (skills) {
        const item = document.createElement("div");

        item.innerHTML =
            `
        <div class="image">
            <img src=${skills.imgpath} alt=${skills.alt}>
        </div>
       
        <p>${skills.description}</p>
        
        `;
        skillset.appendChild(item);
    })
});