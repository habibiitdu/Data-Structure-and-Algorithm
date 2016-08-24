using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data.Entity;
using System.Linq;
using System.Web;
using AccountManagement.Models;

namespace AccountManagement
{
    public class MainDbContext : DbContext
    {
        public MainDbContext() : base("name=DefaultConnection")
        {
            
        }

        public DbSet<User> Users { get; set; }
}
}