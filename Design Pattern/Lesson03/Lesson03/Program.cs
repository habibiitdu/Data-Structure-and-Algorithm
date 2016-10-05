using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices.WindowsRuntime;
using System.Text;
using System.Threading.Tasks;
using Lesson03.Core;


namespace Lesson03
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Client (a or b):  ");
            var client = Console.ReadLine();

            IFactory factory;

            if (client == "a")
            {
                factory = new ClientAFactory();
            }else
            if (client == "b")
            {
                factory= new ClientBFactory();
            }
            else
            {
                return;
            }

            var order = new Order();
            Console.Write("How many computers?  ");
            order.Computers = ConverttoInt32(Console.ReadLine());

            Console.Write("How many tablets?  ");
            order.Tablets = ConverttoInt32(Console.ReadLine());

            Console.Write("How many phones?  ");
            order.SmartPhones = ConverttoInt32(Console.ReadLine()); 

            var company = new HandyDandyManComapny(factory);
            company.Produce(order);

            Console.WriteLine("Created " + company.Computers.Count() + " computers.");
            Console.WriteLine("Created " + company.Tablets.Count() + " tablets.");
            Console.WriteLine("Created " + company.SmartPhones.Count() + " smartphones.");

            Console.ReadLine(); 
        }

        private static int ConverttoInt32(string input)
        {
            if (string.IsNullOrWhiteSpace(input))
            {
                return 0; 
            }
            return Int32.Parse(input);
        }
    }

 }
