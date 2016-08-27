using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Adapter_Pattern
{
    public interface IAdvanceMediaPlayer
    {
        void PlayVlc(string fileName);
        void PlayMp4(string fileName); 
    }
}
