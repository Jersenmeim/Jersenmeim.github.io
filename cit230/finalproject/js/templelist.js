var requestURL = 'https://jersenmeim.github.io/cit230/finalproject/json/temples.json';
fetch(requestURL)
	.then(function (response) {
	return response.json();
	})
.then(function (jsonObject) {
console.table(jsonObject);  // temporary checking for valid response and data parsing
const temples = jsonObject['temples'];
for (let i = 0; i < temples.length; i++ ) {
        let card = document.createElement('div');       // Container

        var divide = document.createElement('div');         // for grid
        divide.setAttribute('class', 'grid');

        var div = document.createElement('div');         // for info
        div.setAttribute('class', 'info');

        var div1 = document.createElement('div');       // for picture
        div1.setAttribute('class', 'pic');

        var div2 = document.createElement('div');      // for temple closure and milestone
        div2.setAttribute('class', 'additionalinfo');


        var div3 = document.createElement('div');       // for temple closure 
        div3.setAttribute('class', 'closure');

        var div4 = document.createElement('div');       // for temple milestone 
        div4.setAttribute('class', 'milestone');



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
        image.setAttribute('alt', "temple sample image only " + i);
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


        card.appendChild(divide);

        divide.appendChild(div1);
        divide.appendChild(div);
       

        div1.appendChild(h2);
        div1.appendChild(p1);
        div1.appendChild(p2);            // for info
        div1.appendChild(p3);
        div1.appendChild(p4);

        div1.appendChild(image);
         div.appendChild(div2); 
        div.appendChild(div4);         // for picture
       

        div2.appendChild(div3);         // for temple closure and milestone
       


        div3.appendChild(h4);           // for temple closure 
        div3.appendChild(p5);
        div3.appendChild(p6);
        div3.appendChild(p7);
        div3.appendChild(p8);
        div3.appendChild(p9);
        div3.appendChild(p10);
        div3.appendChild(p11);
        div3.appendChild(p12);
        div3.appendChild(p13);
        div3.appendChild(p14);
        div3.appendChild(p15);                 
        
      
        div4.appendChild(h5);   // for milestone  
        div4.appendChild(p16);
        div4.appendChild(p17);
        div4.appendChild(p18);

document.querySelector('div.temples').appendChild(card);
}	
      
});


  
