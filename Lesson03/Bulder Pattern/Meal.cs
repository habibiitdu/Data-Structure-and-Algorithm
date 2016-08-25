using System;
using System.Collections.Generic;
using System.Linq;


namespace Builder_Pattern
{
    public class Meal
    {
        private readonly List<IItem> _items = new List<IItem>();

        public void AddItem(IItem item)
        {
            _items.Add(item);
        }

        public float GetCost()
        {
            return _items.Sum(item => item.Price());
        }

        public void ShowItem()
        {
            foreach (var item in _items)
            {
                Console.Write(item.Name()+"\t");
                //Console.Write(item.Packing()+"\t");
                Console.WriteLine(item.Price()+"/=");
            }
        }
    }
}
