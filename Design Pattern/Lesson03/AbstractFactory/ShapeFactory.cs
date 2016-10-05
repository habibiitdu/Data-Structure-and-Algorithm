using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbstractFactory
{
    public class ShapeFactory : AbstractFactory
    {

        public override IColor GetColor(string colorName)
        {
            return null; 
        }

        public override IShape GetShape(string shapeName)
        {
            if (shapeName == null)
            {
                return null; 
            }

            if (shapeName == "circle")
            {
                return new Circle();
            }
            else if (shapeName == "square")
            {
                return new Square();
            }
            else if (shapeName == "rectangle")
            {
                return new Rectangle();
            }

            return null; 
        }

       
    }
}
