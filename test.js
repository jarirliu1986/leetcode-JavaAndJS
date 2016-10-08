var a = function (num) {
    console.log(num);
    num = num-1;
  if(num === 0){
      console.log("finished");
  }else{
      a(num);
  }
};

a(3334);