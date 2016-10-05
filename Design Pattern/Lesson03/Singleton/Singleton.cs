using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Singleton
{
    public class Singleton
    {
        private static Singleton instance = new Singleton();

        private Singleton() { }

        public static Singleton getInstance()
        {
            return instance;
        }

    }
}
