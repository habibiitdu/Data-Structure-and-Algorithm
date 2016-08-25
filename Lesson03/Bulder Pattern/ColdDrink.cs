using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bulder_Pattern
{
    public abstract class ColdDrink : IItem
    {
        public abstract string Name();
        public abstract float Price();


        public Packing Packing()
        {
            return new Bottle();
        }
    }
}
