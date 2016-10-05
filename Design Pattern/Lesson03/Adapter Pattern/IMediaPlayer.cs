using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Adapter_Pattern
{
    public interface IMediaPlayer
    {
         void Play(string audioTypes, string name); 
    }
}
