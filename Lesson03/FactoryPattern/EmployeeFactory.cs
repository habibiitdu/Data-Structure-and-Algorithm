using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FactoryPattern
{
    public class EmployeeFactory
    {
        public IPerson GetDepartment(string department)
        {
            if (department == "engineering")
            {
                return new EngineeringDepartment();
            }
            else if (department == "marketing")
            {
                return new MarketingDepartment();
            }
            else if (department == "sales")
            {
                return new SalesDepartment();
            }
            return null; 
        }
    }
}
