using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FactoryPattern
{
    class Program
    {
        static void Main(string[] args)
        {
            EmployeeFactory factory = new EmployeeFactory();

            IPerson eDepartment = factory.GetDepartment("engineering");
            if (eDepartment != null)
            {
                eDepartment.AddEmployee("Habib");
                Console.ReadKey(); 
            }
        }
    }
}
