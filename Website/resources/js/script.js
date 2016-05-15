// ScrollMagic
$(document).ready(function() {
	var controller = new ScrollMagic.Controller();
  // var controller1 = new ScrollMagic.Controller({globalSceneOptions: {triggerHook: "onEnter", duration: "200%"}});
	
	// title sequence
	var tweenTitle = new TweenMax.staggerFrom(".mainTitle", 1, {
		x: -100,
		opacity: 0,
		ease: Sine.easeOut,
	}, 0.5);
	var sceneTitle = new ScrollMagic.Scene({
		triggerElement: '#title'
	})
	.setTween(tweenTitle)
	.addTo(controller);

	// titleRecyclo
	var tweenTitleRecyclo = new TweenMax.fromTo("#titleRecyclo", 1, {
		display: 'none',
		opacity: 0,
		x: 300,
		y: 300
	},
	{	// css: {display: "block"},
		display: 'block',
		opacity: 1,
		x: 200,
		y: window.innerHeight*0.1,
		ease: Sine.easeOut
	});
	var sceneTitleRecyclo = new ScrollMagic.Scene({
		triggerElement: '#title',
		ease: Sine.easeOut
	})
	.setTween(tweenTitleRecyclo)
	.addTo(controller);

  // intro elements
  var tweenIntro = new TweenMax.staggerFrom(".intro-element", 0.5, {
    x: -100,
    opacity: 0,
    ease: Sine.easeOut,
  }, 0.15);
  var sceneIntro = new ScrollMagic.Scene({
    triggerElement: '#intro'
  })
  .setTween(tweenIntro)
  .addTo(controller);

  // paper
  var tweenPaper = new TweenMax.staggerFrom(".paper-element", 0.5, {
    y: 100,
    opacity: 0,
    ease: Sine.easeOut,
  }, 0.15);
  var scenePaper = new ScrollMagic.Scene({
    triggerElement: '#paper'
  })
  .setTween(tweenPaper)
  .addTo(controller); 

  // paperRecyclo
  var tweenPaperRecyclo = new TweenMax.fromTo("#paperRecyclo", 1, {
    display: 'none',
    opacity: 0,
    x: -1000,
    //y: 300
  },
  { // css: {display: "block"},
    display: 'block',
    opacity: 1,
    x: -200,
    //y: window.innerHeight*0.1,
    ease: Sine.easeOut
  });
  var scenePaperRecyclo = new ScrollMagic.Scene({
    triggerElement: '#paper',
    ease: Sine.easeOut
  })
  .setTween(tweenPaperRecyclo)
  .addTo(controller);

  // plastic
  var tweenPlastic = new TweenMax.staggerFrom(".plastic-element", 0.5, {
    x: 100,
    opacity: 0,
    ease: Sine.easeOut,
  }, 0.15);
  var scenePlastic = new ScrollMagic.Scene({
    triggerElement: '#plastic'
  })
  .setTween(tweenPlastic)
  .addTo(controller);  

  // glass
  var tweenGlass = new TweenMax.staggerFrom(".glass-element", 0.5, {
    y: -100,
    opacity: 0,
    ease: Sine.easeOut,
  }, 0.15);
  var sceneGlass = new ScrollMagic.Scene({
    triggerElement: '#glass'
  })
  .setTween(tweenGlass)
  .addTo(controller);  

  // glassRecyclo
  var tweenGlassRecyclo = new TweenMax.from("#glassRecyclo", 1, {
    display: 'none',
    opacity: 0,
    x: 300,
    //y: 300
    ease: Sine.easeOut
  });
  var scenePaperRecyclo = new ScrollMagic.Scene({
    triggerElement: '#glass',
    ease: Sine.easeOut
  })
  .setTween(tweenGlassRecyclo)
  .addTo(controller);

  // metal
  var tweenMetal = new TweenMax.staggerFrom(".metal-element", 0.5, {
    x: -100,
    opacity: 0,
    ease: Sine.easeOut,
  }, 0.15);
  var sceneMetal = new ScrollMagic.Scene({
    triggerElement: '#metal'
  })
  .setTween(tweenMetal)
  .addTo(controller);  

  // other
  var tweenOther = new TweenMax.staggerFrom(".other-element", 0.5, {
    y: 100,
    opacity: 0,
    ease: Sine.easeOut,
  }, 0.15);
  var sceneOther = new ScrollMagic.Scene({
    triggerElement: '#other'
  })
  .setTween(tweenOther)
  .addTo(controller);  

  // otherRecyclo
  var tweenOtherRecyclo = new TweenMax.from("#otherRecyclo", 1, {
    display: 'none',
    opacity: 0,
    // x: -1000,
    y: -600,
    ease: Sine.easeOut
  });
  var sceneOtherRecyclo = new ScrollMagic.Scene({
    triggerElement: '#other',
    ease: Sine.easeOut
  })
  .setTween(tweenOtherRecyclo)
  .addTo(controller);


  // form
  var tweenGame = new TweenMax.staggerFrom(".game-element", 0.5, {
    y: 100,
    opacity: 0,
    ease: Sine.easeOut,
  }, 0.15);
  var sceneGame = new ScrollMagic.Scene({
    triggerElement: '#gametrigger'
  })
  .setTween(tweenGame)
  .addTo(controller);    

  // parallax
  // new ScrollMagic.Scene({triggerElement: "#intro"})
  //         .setTween("#intro", {y: "80%", ease: Linear.easeNone})
  //         // .addIndicators()
  //         .addTo(controller1);
});




// Particles Set Up
particlesJS("particles-js", {
 "particles": {
   "number": {
     "value": 80,
     "density": {
       "enable": true,
       "value_area": 800
     }
   },
   "color": {
     "value": "#37a700"
   },
   "shape": {
     "type": "circle",
     "stroke": {
       "width": 0,
       "color": "#000000"
     },
     "polygon": {
       "nb_sides": 5
     },
     "image": {
       "src": "img/github.svg",
       "width": 100,
       "height": 100
     }
   },
   "opacity": {
     "value": 0.8,
     "random": false,
     "anim": {
       "enable": false,
       "speed": 1,
       "opacity_min": 0.1,
       "sync": false
     }
   },
   "size": {
     "value": 3,
     "random": true,
     "anim": {
       "enable": false,
       "speed": 40,
       "size_min": 0.1,
       "sync": false
     }
   },
   "line_linked": {
     "enable": true,
     "distance": 150,
     "color": "#37a700",
     "opacity": 0.6,
     "width": 1
   },
   "move": {
     "enable": true,
     "speed": 1,
     "direction": "none",
     "random": false,
     "straight": false,
     "out_mode": "out",
     "bounce": false,
     "attract": {
       "enable": false,
       "rotateX": 600,
       "rotateY": 1200
     }
   }
 },
 "interactivity": {
   "detect_on": "canvas",
   "events": {
     "onhover": {
       "enable": true,
       "mode": "grab"
     },
     "onclick": {
       "enable": false,
       "mode": "push"
     },
     "resize": true
   },
   "modes": {
     "grab": {
       "distance": 140,
       "line_linked": {
         "opacity": 1
       }
     },
     "bubble": {
       "distance": 400,
       "size": 40,
       "duration": 2,
       "opacity": 8,
       "speed": 3
     },
     "repulse": {
       "distance": 200,
       "duration": 0.4
     },
     "push": {
       "particles_nb": 4
     },
     "remove": {
       "particles_nb": 2
     }
   }
 },
 "retina_detect": true
});
