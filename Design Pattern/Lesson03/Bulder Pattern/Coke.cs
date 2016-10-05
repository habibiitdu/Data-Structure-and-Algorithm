using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Builder_Pattern
{
    public class Coke : ColdDrink
    {
        public override string Name()
        {
            return "Coke"; 
        }

        public override float Price()
        {
            return 15.0f; 
        }
    }
}
