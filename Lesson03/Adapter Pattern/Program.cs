using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Adapter_Pattern
{
    class Program
    {
        static void Main(string[] args)
        {
            Mp3Player player = new Mp3Player();
            player.Play("mp3","song.mp3");
            player.Play("mp4", "song.mp4");
            player.Play("wav", "song.wav");
            player.Play("vlc","song.vlc");
            Console.ReadKey(); 
        }
    }
}
