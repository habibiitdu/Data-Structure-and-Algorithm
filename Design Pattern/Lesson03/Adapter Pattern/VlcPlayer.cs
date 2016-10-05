using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Adapter_Pattern
{
    public class VlcPlayer: IAdvanceMediaPlayer
    {
        public void PlayVlc(string fileName)
        {
            Console.WriteLine("Playing Vlc Player : " + fileName);
        }

        public void PlayMp4(string fileName)
        {
            throw new NotImplementedException();
        }
    }
}
