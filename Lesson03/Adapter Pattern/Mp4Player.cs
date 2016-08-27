using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Adapter_Pattern
{
    public class Mp4Player: IAdvanceMediaPlayer
    {
        public void PlayVlc(string fileName)
        {
            throw new NotImplementedException();
        }

        public void PlayMp4(string fileName)
        {
            Console.WriteLine("Playing Mp4 Player: " + fileName);
        }
    }
}
