using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bulder_Pattern
{
    public class Pepsi : ColdDrink
    {
        public override string Name()
        {
            return "Pepsi"; 
        }

        public override float Price()
        {
            return 17.0f; 
        }
    }
}
