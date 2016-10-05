using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Adapter_Pattern
{
    public class Mp3Player : IMediaPlayer
    {
        private MediaAdapter mediaAdapter; 

        public void Play(string audioTypes, string name)
        {
            if (audioTypes == "mp3")
            {
                Console.WriteLine("Playing Mp3 file: " + name);
            }

            else if (audioTypes == "vlc" || audioTypes == "mp4")
            {
                mediaAdapter = new MediaAdapter(audioTypes);
                mediaAdapter.Play(audioTypes, name);
            }
            else
            {
                Console.WriteLine("Invalid Media: " + name + " File not supported");
            }
        }
    }
}
