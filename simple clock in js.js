function setup()
		{
			createCanvas(1300,1300);
			angleMode(DEGREES);
		}
	function draw()
		{
			background (0);
			translate(200,200);
			rotate(-90);
			let hr= hour();
			let mn= minute();
     		let sc= second();
//layout
			strokeWeight(8);
			stroke(255,100,150);
			noFill();
//seconds
			stroke(255,100,150);
        	let end= map(sc,0,59, 0,360);
			arc(0,0,300,300,0,end);
//minutes
        	stroke(150,100,255);
			let end1= map(mn,0,59, 0,360);
			arc(0,0,280,280,0,end1);
		
//hours
			stroke(150,255,100);
			let end2= map(hr%12,0,12, 0,360);
			arc(0,0,260,260,0,end2);
			rotate(-270);
			stroke(150,255,100);
			fill(150,255,100);
			noStroke(150,255,100);
			text(hr +':',-15,0);
			fill(150,100,255);
			noStroke(150,100,255);
			text( mn + ':',0,0);
			fill(255,100,150);
			noStroke(150,255,100);
			text(sc,15,0);

			rotate(-90);
//second hand
			push();
			rotate(end);
			stroke(255,100,150);
			line(0,0,100,0);
			pop();
//minute hand
			push();
			rotate(end1);
			stroke(150,100,255);
			line(0,0,75,0);
			pop();
//hr hand
			push();
			rotate(end2);
			stroke(150,255,100);
			line(0,0,50,0);
			pop();
//point at middle
			stroke(255);
			point(0,0);

		}
