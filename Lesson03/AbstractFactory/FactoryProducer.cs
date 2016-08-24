using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbstractFactory
{
    public class FactoryProducer
    {
        public static AbstractFactory GetFactory(string factoryName)
        {
            if (factoryName == null)
            {
                return null; 
            }

            if (factoryName == "shape")
            {
                return new ShapeFactory();
            }
            else if (factoryName == "color")
            {
                return new ColorFactory();
            }
            return null; 
        }
    }
}
