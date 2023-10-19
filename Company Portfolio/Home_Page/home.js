
window.addEventListener('resize', resize);


function resize() {
    let vh = window.innerHeight * 0.01;
    document.documentElement.style.setProperty("--vh", `${Math.max(vh, 45)}px`
    )};
    var width = window.innerWidth;
    var height = window.innerHeight;

    var fk = document.querySelector('.fk');
    var gk = document.querySelector('.gk');
    var child6 = document.querySelector('#child6');

    if (width <= 768) {
        fk.style.width = '100%';
        gk.style.fontSize = '24px';
        child6.style.fontSize = '18px';
    } else {
        fk.style.width = '150px';
        gk.style.fontSize = '36px';
        child6.style.fontSize = '24px';

    }
    resize();
    






