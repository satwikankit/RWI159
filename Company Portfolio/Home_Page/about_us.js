window.addEventListener('resize', adjustFontSize);

function adjustFontSize() {
    var vw = window.innerWidth / 100;
    document.documentElement.style.fontSize = vw + 'px';
}

adjustFontSize();
function adjustNavBar() {
    var vw = window.innerWidth / 100;
    var navBar = document.getElementById('myNavBar');
    
    if (vw <= 768) {
    navBar.classList.add('navbar-collapse');
    navBar.classList.remove('navbar-expand');
    } else {
    navBar.classList.add('navbar-expand');
    navBar.classList.remove('navbar-collapse');
    }
    }
    
    window.addEventListener('resize', adjustNavBar);
    
    
        