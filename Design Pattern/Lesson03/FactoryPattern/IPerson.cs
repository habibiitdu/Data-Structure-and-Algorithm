using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FactoryPattern
{
    public interface IPerson
    {
        void AddEmployee(string name);
        void RemoveEmployee(string name);
    }
}
