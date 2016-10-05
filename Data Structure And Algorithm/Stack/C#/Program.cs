using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataStructure
{
    class Program
    {
        static void Main(string[] args)
        {
            Stack myStack = new Stack(5);
            myStack.Push(5);
            myStack.Push(10);
            myStack.Push(15);
            myStack.Push(20);
            myStack.Push(25);
            myStack.Push(30);
            int popN1 = myStack.Pop();
            int popN2 = myStack.Pop();
            int popN3 = myStack.Pop();
            int popN4 = myStack.Pop();
            int popN5 = myStack.Pop();
            int popN6 = myStack.Pop(); 


            Console.ReadKey();
        }
    }
}
