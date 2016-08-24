using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FactoryPattern
{
    class EngineeringDepartment : IPerson
    {
        private readonly List<string> _employees = new List<string>();  

        public void AddEmployee(string name)
        {
            _employees.Add(name);
            Console.WriteLine("Engineer " + name + " added");
        }

        public void RemoveEmployee(string name)
        {
            _employees.Remove(name); 
        }
    }
}
