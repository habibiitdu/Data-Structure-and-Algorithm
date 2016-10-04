using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bridge_Pattern
{
    class Program
    {
        static void Main(string[] args)
        {
            Shape redCircle = new Circle(10,100,100, new RedCircle());
            Shape greenCircle = new Circle(10,150,150, new GreenCirclem());

            redCircle.Draw();
            greenCircle.Draw();

            Console.ReadKey(); 
        }
    }
}
