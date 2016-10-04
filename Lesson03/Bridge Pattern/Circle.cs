using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace Bridge_Pattern
{
    public class Circle : Shape
    {
        private readonly int radius, x, y;

        public Circle(int radius, int x, int y, IDrawApi drawApi): base(drawApi)
        {
            this.radius = radius;
            this.x = x;
            this.y = y; 
        }

        public override void Draw()
        {
            DrawApi.DrawCircle(radius,x,y);
        }
    }
}
