"use strict";
//a
function add(a = 5, b = 5) {
    console.log(a + b);
}
add();
add(2, 2);
add(10, 2);
//b
let displayFriend = function (name, ...friend) {
    console.log(name);
    for (let frn of friend) {
        console.log(frn);
    }
};
// let friendList = ["abc", "xyz", "try"];
displayFriend("sourav", "friendList", "abc", "xyz", "try");
let friendList = ["abc", "xyz", "try"];
displayFriend("sourav", ...friendList);
//c
console.log(" ");
let pringCapitalName = (...name) => {
    for (let n of name) {
        console.log(n.toUpperCase());
    }
};
let nameList = ["sourav", "ravi", "shivansh"];
pringCapitalName(...nameList);
//# sourceMappingURL=demo.js.map