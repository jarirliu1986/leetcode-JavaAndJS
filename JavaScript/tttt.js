/**
 * Created by doralau on 3/12/17.
 */

function Test(name,age){
    this.name = name;
    this.age = age;

};
// Test.prototype = {
//     name:'aliyun',
//     hasOwnproperty:function(){
//         return false;
//     }
// };
var instance = new Test('alibaba',102);

console.log(Test.hasOwnProperty('age'));

// class account{
//     constructor(cash){
//         this.total = cash;
//         this.getCash = function () {
//             return cash;
//         }
//         this.withdraw = function (amount) {
//             var total = this.total - amount;
//             this.total = total > 0? total : 0;
//             return this;
//         }
//         this.deposit = function (amount) {
//             this.total = this.total + amount;
//             return this;
//         }
//     }
// }
//
// var my = new account(23);
// my.deposit(344).deposit(9).withdraw(87);
// console.log(my.total);
// function Emitter() {
//     this.events = {}
// }
//
// Emitter.prototype.emit = function (type, listener) {
//     this.events[type] = this.events[type] || [];
//     this.events[type].push(listener);
// }
//
// Emitter.prototype.on = function (type) {
//     this.events[type].forEach(function (cb) {
//         cb();
//     })
// }
//
// var em = new Emitter();
// em.emit("greet", function () {
//     console.log("hello");
// });
// em.emit("greet", function () {
//     console.log("hi");
// });
// em.on("greet");
//




// function multiply(foo, bar) {
//     if (foo == 0 || bar == 0) return 0;
//     else if (bar < 0){
//         return -foo + multiply(foo, bar + 1);
//     }else{
//         return foo + multiply(foo, bar - 1);
//     }
//
// }
//
// console.log(multiply(3,7));