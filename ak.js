//If the mouse is accessed, the main title changes.
$('h1').mouseenter(function () {
    $('#h1s').text("Welcome to highteen world").attr('style', 'color:#4641D9');
})
$('h1').mouseleave(function () {
    $('#h1s').text("Find Your Highteen Drama/Movie").attr('style', 'color:black');
})
$('h1').mouseenter(function () {
    $('#h12s').text("Do you love drama?").attr('style', 'color:#4641D9');
})
$('h1').mouseleave(function () {
    $('#h12s').text("Find Your Highteen Drama/Movie").attr('style', 'color:black');
})
$('h1').mouseenter(function () {
    $('#h13s').text("How about korea?").attr('style', 'color:#4641D9');
})
$('h1').mouseleave(function () {
    $('#h13s').text("Find Your Highteen Drama/Movie").attr('style', 'color:black');
})
$('h1').mouseenter(function () {
    $('#h14s').text("are you teenager?").attr('style', 'color:#4641D9');
})
$('h1').mouseleave(function () {
    $('#h14s').text("Find Your Highteen Drama/Movie").attr('style', 'color:black');
})
//When clicked with the mouse, the original contents were lost and pictures were filled.
$('h3').click(function () {
    $('#h3s').fadeOut(1000); 
    $('#p1s').append("                                      " + '<img src="¶Ù¾î³ð2.png"/>').show(1000);
    $('#p1s').append("                                      " + '<img src="¶Ù¾î³ð.png"/>').show;
    $('#p1s').append("                                      " + '<img src="¶Ù¾î³ð3.png"/>').show;
    $('#p1s').append("                                      " + '<img src="¶Ù¾î³ð4.png"/>').show;
    $('#p1s').append("                                      " + '<img src="¶Ù¾î³ð5.png"/>').show;
    $('#p1s').append("                                      " + '<img src="¶Ù¾î³ð6.png"/>').show;
})
//if the mouse is accessed, the title flicker.
$('h3').mouseenter(function () {
    for(i = 1; i<5; i++){
    $('#h32s').fadeToggle(600);}     
})
$('h3').mouseenter(function () {
    for (i = 1; i < 5; i++) {
        $('#h32').fadeToggle(600);
    }
})
$('h3').mouseenter(function () {
    for (i = 1; i < 5; i++) {
        $('#h33').fadeToggle(600);
    }
})
$('h3').mouseenter(function () {
    for (i = 1; i < 5; i++) {
        $('#h34').fadeToggle(600);
    }
})
$('h3').mouseenter(function () {
    for (i = 1; i < 5; i++) {
        $('#h35').fadeToggle(600);
    }
})
$('h3').mouseenter(function () {
    for (i = 1; i < 5; i++) {
        $('#h36').fadeToggle(600);
    }
})
//When clicked it, the subtitle became larger, and when double-clicked it, it prompted to come back.
$('h2').click(function(){
    $('#h22s').animate({fontSize: "5em" }, 2000)
})
$('h2').dblclick(function () {
    $('#h22s').animate({ fontSize: "3em" }, 2000)
})
$('h9').click(function () {
    $('#h92s').animate({ fontSize: "5em" }, 2000)
})
$('h9').dblclick(function () {
    $('#h92s').animate({ fontSize: "3em" }, 2000)
})
$('h7').click(function () {
    $('#h72s').animate({ fontSize: "5em" }, 2000)
})
$('#h72s').dblclick(function () {
    $('#h72s').animate({ fontSize: "3em" }, 2000)
})
$('h2').click(function () {
    $('#h23s').animate({ fontSize: "5em" }, 2000)
})
$('h2').dblclick(function () {
    $('#h23s').animate({ fontSize: "3em" }, 2000)
})
$('h9').click(function () {
    $('#h93s').animate({ fontSize: "5em" }, 2000)
})
$('h9').dblclick(function () {
    $('#h93s').animate({ fontSize: "3em" }, 2000)
})
$('h2').click(function () {
    $('#h24s').animate({ fontSize: "5em" }, 2000)
})
$('h2').dblclick(function () {
    $('#h24s').animate({ fontSize: "3em" }, 2000)
})
$('h9').click(function () {
    $('#h94s').animate({ fontSize: "5em" }, 2000)
}) 
$('h9').dblclick(function () {
    $('#h94s').animate({ fontSize: "3em" }, 2000)
})
$('h7').click(function () {
    $('#h74s').animate({ fontSize: "5em" }, 2000)
})
$('#h72s').dblclick(function () {
    $('#h74s').animate({ fontSize: "3em" }, 2000)
})
//if the button is pressed, scroll to that position.
function scroll(seq) {
        var offset = $("#h3"+ seq).offset();
        $('html,body').animate({ scrollTop: offset.top }, 400);
}
//If the user likes the contents of the page, they can press the button like the "like" function of "facebook".
function a() {
    $('#day1').append('<img src="½º¸¶ÀÏ.png"/>').show;
}
function b() {
    $('#day2').append('<img src="½º¸¶ÀÏ.png"/>').show;
}
function c() {
    $('#day3').append('<img src="½º¸¶ÀÏ.png"/>').show;
}
function d() {
    $('#day4').append('<img src="½º¸¶ÀÏ.png"/>').show;
}
function e() {
    $('#day5').append('<img src="½º¸¶ÀÏ.png"/>').show;
}
function f() {
    $('#day6').append('<img src="½º¸¶ÀÏ.png"/>').show;
}
function g() {
    $('#day7').append('<img src="½º¸¶ÀÏ.png"/>').show;
}
function h() {
    $('#day8').append('<img src="½º¸¶ÀÏ.png"/>').show;
}
function m() {
    $('#day9').append('<img src="½º¸¶ÀÏ.png"/>').show;
}
function n() {
    $('#day10').append('<img src="½º¸¶ÀÏ.png"/>').show;
}
function o() {
    $('#day11').append('<img src="½º¸¶ÀÏ.png"/>').show;
}
function p() {
    $('#day12').append('<img src="½º¸¶ÀÏ.png"/>').show;
}
function q() {
    $('#day13').append('<img src="½º¸¶ÀÏ.png"/>').show;
}
function r() {
    $('#day14').append('<img src="½º¸¶ÀÏ.png"/>').show;
}
function s() {
    $('#day15').append('<img src="½º¸¶ÀÏ.png"/>').show;
}












