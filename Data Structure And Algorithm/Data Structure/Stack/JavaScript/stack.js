var stack = new Array(); 

var printStack = function(){
    for(int i=0; i<stack.length; i++){
        console.log(stack[i] + " "); 
    }
}

stack.push(5);
printStack();
stack.push(7);
printStack();
stack.push(9);
printStack();

stack.pop(); 
printStack();
stack.pop(); 
printStack();
