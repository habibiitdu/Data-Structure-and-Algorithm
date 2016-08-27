using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Adapter_Pattern
{
    public class MediaAdapter : IMediaPlayer
    {
        private IAdvanceMediaPlayer advanceMediaPlayer;

        public MediaAdapter(string audioType)
        {
            if (audioType == "vlc")
            {
                advanceMediaPlayer =  new VlcPlayer();
            }
            else if (audioType == "mp4")
            {
                advanceMediaPlayer = new Mp4Player();
            }
        }

        public void Play(string audioTypes, string name)
        {
            if (audioTypes == "vlc")
            {
             advanceMediaPlayer.PlayVlc(name);
            }
            else if (audioTypes == "mp4")
            {
                advanceMediaPlayer.PlayMp4(name);
            }
        }
    }
}
