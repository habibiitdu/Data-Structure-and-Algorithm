using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbstractFactory
{
    class Program
    {
        static void Main(string[] args)
        {
            AbstractFactory shapeFactory = FactoryProducer.GetFactory("shape");

            IShape cicle = shapeFactory.GetShape("circle"); 
            cicle.Draw();

            IShape square = shapeFactory.GetShape("square"); 
            square.Draw();

            IShape rectangle = shapeFactory.GetShape("rectangle"); 
            rectangle.Draw();

            AbstractFactory colorFactory = FactoryProducer.GetFactory("color");

            IColor red = colorFactory.GetColor("red");
            red.Fill();

            IColor green = colorFactory.GetColor("green");
            green.Fill();

            IColor blue = colorFactory.GetColor("blue");
            blue.Fill();

            Console.ReadKey(); 
        }
    }
}
