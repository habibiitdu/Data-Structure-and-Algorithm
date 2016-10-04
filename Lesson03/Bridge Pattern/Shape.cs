using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bridge_Pattern
{
    public abstract class Shape
    {
        protected IDrawApi DrawApi; 
        protected Shape(IDrawApi drawApi)
        {
            DrawApi = drawApi; 
        }

        public abstract void Draw(); 

    }
}
