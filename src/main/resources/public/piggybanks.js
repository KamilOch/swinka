function pageLoad(subpage) {
    if (subpage == "piggybank" || subpage == "piggybanks") {
        fillStatusBars();
        initDropdowns();
        $('.dropdown-btn').on('click', openDropdown)
    }
    if (subpage == "piggybank") {
        var shareBtn = document.querySelector('#shareBtn');
        shareBtn.addEventListener('click', facebookShare, false);
        countShares();
    }
}

function initDropdowns() {

}

function openDropdown(){
  var dropdown = document.querySelector(".dropdown");
  dropdown.classList.toggle("dropdown--active");
}

function fillStatusBars() {
    var bars = document.querySelectorAll('.progress-bar');
    for (var i = 0; i < bars.length; i++) {
        var filling = bars[i].querySelector('.progress-bar__progress');
        var current = parseInt(bars[i].getAttribute('data-current'));
        var target = parseInt(bars[i].getAttribute('data-target'));
        var progress = (current / target) * 100;
        filling.style.width = progress + "%";
    }
}

function countShares() {
    var url = window.location.href;
    var sharesContainer = document.querySelector('#sharesCounter');
    var request = $.ajax({
        url: `https://graph.facebook.com/?id=${url}`,
        method: "GET",
        contentType: "application/x-www-form-urlencoded"
    });

    request.done(function(data) {
        sharesContainer.innerText = data.share.share_count
    });

    request.fail(function(jqXHR, textStatus) {
        console.error("Error during getting shares count.");
        sharesContainer.innerText = "Wystąpił błąd"
    });
}

function facebookShare(winWidth, winHeight) {
    // var url = window.location.href;
    var url = "http://5eff2351.ngrok.io/piggybank.php"
    var winTop = (screen.height / 2) - (winHeight / 2);
    var winLeft = (screen.width / 2) - (winWidth / 2);
    window.open('https://www.facebook.com/sharer.php?s=100&p[url]=' + url, "Udostępnij", "width=500,height=500");
}

document.addEventListener('DOMContentLoaded', pageLoad, false);

(function() {
    var subpage = document.querySelector('main').getAttribute('data-subpage');
    pageLoad(subpage)
})();
