using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataStructure
{
    public class Stack
    {
        private int [] _myStack;
        private int _top, _maxSize; 

        public Stack(int max)
        {
            _maxSize = max;
            _myStack = new int[_maxSize];
            _top = -1; 
        }

        public bool IsEmpty()
        {
            if (_top == -1) return true;
            return false;
        }

        public bool IsOver()
        {
            if (_top == (_maxSize-1)) return true;
            return false; 
        }

        public void Push(int data)
        {
            if (IsOver())
            {
                  
                Console.WriteLine("Pushing failed. Stack is Over");
            }
            else
            {
                _myStack[++_top] = data;
                Console.WriteLine("Element Pushed: " + _myStack[_top]);
                PrintStack();
            }
        }

        public int Pop()
        {
            if (IsEmpty())
            {
                Console.WriteLine("No Element in the Stack");
                return -1; 
            }
            int popElement = _myStack[_top]; 
            Console.WriteLine("Element Popped: " + popElement);
            _myStack[_top--] = 0; 
            PrintStack();
            return popElement;

        }

        public void PrintStack()
        {
            Console.Write("Stack Current State: ");
            for (int i = 0; i < _myStack.Length; i++)
            {
                Console.Write(_myStack[i] + " ");
            }
            Console.WriteLine();
        }
    }
}
