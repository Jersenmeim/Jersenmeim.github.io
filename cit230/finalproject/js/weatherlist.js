var requestURL = 'https://jersenmeim.github.io/lesson13/temples.json';
fetch(requestURL)
	.then(function (response) {
	return response.json();
	})
.then(function (jsonObject) {
console.table(jsonObject);  // temporary checking for valid response and data parsing
const temples = jsonObject['temples'];
for (let i = 0; i < temples.length; i++ ) {
        let card = document.createElement('section');
        let info = document.createElement('section');
        let div = document.createElement('div');
        let h2 = document.createElement('h2');
        let h3 = document.createElement('h3');
        let h4 = document.createElement('h3');
        let h5 = document.createElement('h3');
        let image = document.createElement('img');
        let p1 = document.createElement('p');
        let p2 = document.createElement('p');
        let p3 = document.createElement('p');
        let p4 = document.createElement('p');
        let p5 = document.createElement('p');
        let p6 = document.createElement('p');
        let p7 = document.createElement('p');
        let p8 = document.createElement('p');
        let p9 = document.createElement('p');
        let p10 = document.createElement('p');
        let p11 = document.createElement('p');
        let p12 = document.createElement('p');
        let p13 = document.createElement('p');
        let p14 = document.createElement('p');
        let p15 = document.createElement('p');
        let p16 = document.createElement('p');
        let p17 = document.createElement('p');
        let p18 = document.createElement('p');

     


        h2.textContent = temples[i].name;
        p1.textContent =  "Address: " + temples[i].address;
        p2.textContent =  "Telephone: " + temples[i].telephone;
        p3.textContent =  "Email: " + temples[i].email;
        p4.textContent = temples[i].ordinanceschedule;
        image.setAttribute('src', temples[i].photo);
        image.setAttribute('alt', temples[i].name + ' Image' );
        h4.textContent = "Temple Closure";
        p5.textContent = temples[i].TempleClosures[0]; 
        p6.textContent = temples[i].TempleClosures[1]; 
        p7.textContent = temples[i].TempleClosures[2]; 
        p8.textContent = temples[i].TempleClosures[3]; 
        p9.textContent = temples[i].TempleClosures[4]; 
        p10.textContent = temples[i].TempleClosures[5]; 
        p11.textContent = temples[i].TempleClosures[6]; 
        p12.textContent = temples[i].TempleClosures[7]; 
        p13.textContent = temples[i].TempleClosures[8]; 
        p14.textContent = temples[i].TempleClosures[9]; 
        p15.textContent = temples[i].TempleClosures[10]; 
        h5.textContent = "Milestone";
        p16.textContent = temples[i].Milestones[0]; 
        p17.textContent = temples[i].Milestones[1]; 
        p18.textContent = temples[i].Milestones[2]; 


       
               
        card.appendChild(info);
        info.appendChild(h2);
        info.appendChild(p1);
        info.appendChild(p2);
        info.appendChild(p3);
        info.appendChild(p4);
        card.appendChild(div);               
        div.appendChild(image);
        card.appendChild(h4);
        card.appendChild(p5);
        card.appendChild(p6);
        card.appendChild(p7);
        card.appendChild(p8);
        card.appendChild(p9);
        card.appendChild(p10);
        card.appendChild(p11);
        card.appendChild(p12);
        card.appendChild(p13);
        card.appendChild(p14);
        card.appendChild(p15);
        card.appendChild(h5);
        card.appendChild(p16);
        card.appendChild(p17);
        card.appendChild(p18);
document.querySelector('div.temples').appendChild(card);
}	
      
});


  