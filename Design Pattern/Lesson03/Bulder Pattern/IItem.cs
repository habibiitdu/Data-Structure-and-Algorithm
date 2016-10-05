using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection.Emit;
using System.Text;
using System.Threading.Tasks;

namespace Builder_Pattern
{
   public interface IItem
   {
       string Name();
       Packing Packing();
       float Price(); 
   }
}
