using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bulder_Pattern
{
    class Program
    {
        static void Main(string[] args)
        {
           MealBuilder mealBuilder = new MealBuilder();

           Meal bMeal = mealBuilder.PrepareMealForBelalVai();
           Meal zMeal= mealBuilder.PrepareMealForZonaedVai(); 

           Console.WriteLine("Meals for Zonayed and Belal have been prepared");
           Console.WriteLine("Total Costing is : " + "Belal: " + bMeal.GetCost() + " & Zonayed: " + zMeal.GetCost());
           Console.WriteLine("Total Cost: " + (bMeal.GetCost() + zMeal.GetCost()));
           Console.WriteLine("Cost Details are given below: ");
           Console.WriteLine("Belal Meal Details: ");
           bMeal.ShowItem();
           Console.WriteLine("Zonaed Meal Details: ");
           zMeal.ShowItem();


           Console.ReadKey(); 
        }
    }
}
