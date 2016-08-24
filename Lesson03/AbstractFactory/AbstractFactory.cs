using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbstractFactory
{
    public abstract class AbstractFactory
    {
        public abstract IShape GetShape(string shapeName);
        public abstract IColor GetColor(string colorName); 
    }
}
