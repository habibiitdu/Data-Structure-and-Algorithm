using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbstractFactory
{
    public class ColorFactory : AbstractFactory
    {

        public override IShape GetShape(string shapeName)
        {
            return null; 
        }

        public override IColor GetColor(string colorName)
        {
            if (colorName == null)
            {
                return null;
            }

            if (colorName == "red")
            {
                return new Red();
            }
            else if (colorName == "green")
            {
                return new Green();
            }
            else if (colorName == "blue")
            {
                return new Blue();
            }

            return null; 
        }
    }
}
