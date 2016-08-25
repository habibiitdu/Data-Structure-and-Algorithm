using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bulder_Pattern
{
    public class MealBuilder
    {
        public Meal PrepareMealForZonaedVai()
        {
            Meal meal = new Meal();
            meal.AddItem(new ChickenBurger());
            meal.AddItem(new VegBurger());
            meal.AddItem(new Coke());
            meal.AddItem(new VegBurger());
            return meal;
        }

        public Meal PrepareMealForBelalVai()

        {
            Meal meal = new Meal();
            meal.AddItem(new ChickenBurger());
            meal.AddItem(new Coke());
            return meal;
        }
    }
}

