using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.AccessControl;
using System.Text;
using System.Threading.Tasks;

namespace Builder_Pattern
{
    public abstract class Burger : IItem
    {

        public Packing Packing()
        {
            return new Wrapper();
        }

        public abstract string Name(); 
        public abstract float Price(); 

    }
}
