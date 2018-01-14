package Main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import API.TitleAPI;
import Comandos.AdminCommand;
import Comandos.AplicarCommand;
import Comandos.AutoSoupCommand;
import Comandos.BroadcastCommand;
import Comandos.BuildCommand;
import Comandos.CageCommand;
import Comandos.ChallengeCommand;
import Comandos.ChatCommand;
import Comandos.ClearchatCommand;
import Comandos.ClicktestCommand;
import Comandos.CoinsCommand;
import Comandos.DeathCommand;
import Comandos.FpsCommand;
import Comandos.GamemodeCommand;
import Comandos.GiveKitCommand;
import Comandos.GivePermissionCommand;
import Comandos.GiveVipCommand;
import Comandos.GiveXpCommand;
import Comandos.GroupSetCommand;
import Comandos.HeadCommand;
import Comandos.HelpCommand;
import Comandos.InvisCommand;
import Comandos.InvseeCommand;
import Comandos.KitCommand;
import Comandos.Loja;
import Comandos.MOTDCommand;
import Comandos.MainCommand;
import Comandos.ManutentionCommand;
import Comandos.MonitorCommand;
import Comandos.PermissionsListCommand;
import Comandos.PingCommand;
import Comandos.PromoveCommand;
import Comandos.PvPCommand;
import Comandos.RegrasCommand;
import Comandos.ReloadCommand;
import Comandos.RemoveKitCommand;
import Comandos.RemovePermissionCommand;
import Comandos.RemoveVipCommand;
import Comandos.ReportCommand;
import Comandos.ScoreCommand;
import Comandos.SorteioKitCommand;
import Comandos.SorteioVipCommand;
import Comandos.SpawnCommand;
import Comandos.Staff;
import Comandos.StaffCommand;
import Comandos.SumoCommand;
import Comandos.TagCommand;
import Comandos.TeleportCommand;
import Comandos.TellCommand;
import Comandos.UpRankCommand;
import Comandos.VisCommand;
import Comandos.YoutuberCommand;
import Comandos.sKitCommand;
import Comandos.setArenaCommand;
import Eventos.AllEvent;
import Eventos.BrokenItemEvent;
import Eventos.ChatEvent;
import Eventos.JoinEvent;
import Eventos.KillEvent;
import Eventos.NerfsEvent;
import Eventos.PluginsEvent;
import Eventos.RespawnEvent;
import Eventos.ServerexitEvent;
import Eventos.SoupEvent;
import Inventarios.Admins;
import Inventarios.KitSelector;
import Inventarios.KitSelector2;
import Inventarios.Monitor;
import Inventarios.PerfilGUI;
import Inventarios.VisGui;
import Inventarios.Warps;
import Kits.Ajnin;
import Kits.Anchor;
import Kits.Assassin;
import Kits.Boxer;
import Kits.BurstMaster;
import Kits.Camel;
import Kits.Deshfire;
import Kits.Deshviper;
import Kits.Fisherman;
import Kits.Forcefield;
import Kits.Gladiator;
import Kits.Heath;
import Kits.Hulk;
import Kits.Hunter;
import Kits.Kangaroo;
import Kits.Madman;
import Kits.Magma;
import Kits.Monk;
import Kits.Ninja;
import Kits.Phantom;
import Kits.Poseidon;
import Kits.Rain;
import Kits.Reaper;
import Kits.Ryu;
import Kits.Seya;
import Kits.Snail;
import Kits.Sonic;
import Kits.Specialist;
import Kits.Stomper;
import Kits.Switcher;
import Kits.Thor;
import Kits.Thresh;
import Kits.TimeLord;
import Kits.Titan;
import Kits.Turtle;
import Kits.Urgal;
import Kits.Viking;
import Kits.Viper;
import Manager.Groups;
import Manager.TopKillStreak;
import Outros.ServerMotd;
import Outros.ServerSignRecraft;
import Outros.ServerSignSoup;
import Outros.ServerSignVIP;
import ScoreBoard.BlinkEffect;
import ScoreBoard.ScoreboardHelper;
import ScoreBoard.ScoreboardUser;
import ScoreBoard.Scroller;
import Utilidades.KitAPI;
import Utilidades.Listeners;
import Utilidades.TagsAPI;
import Utilidades.WarpsAPI;
import net.minecraft.util.com.google.common.collect.Lists;

public class Main extends JavaPlugin {
	
	public static Plugin plugin;
	public static Main instance;
	public static BlinkEffect bk = new BlinkEffect();
	public static Scroller sc;
	public static Main getInstace() {
		return instance;
	}
	
	public File stats1;
	public YamlConfiguration stats;
	public File warps1;
	public YamlConfiguration warps;
	public File lojacashvip1;
	public YamlConfiguration lojacashvip;
	public File arenas1;
	public YamlConfiguration arenas;
	public File perms1;
	public YamlConfiguration perms;

	public static List<String> jogadores = Lists.newArrayList();
	public static ArrayList<String> Jogadores = new ArrayList<String>();
	public static ArrayList<String> fazendoLogin = new ArrayList<>();
	public static HashMap<Player, ScoreboardHelper> scoreboard = new HashMap<>();

	

	public void onEnable() {
	    plugin = this;
	    instance = this;
	    saveConfig();
		instance = this;
		saveDefaultConfig();
		File stats = new File(getDataFolder(), "stats.yml");
		if (!stats.exists())
			saveResource("stats.yml", false);
		stats1 = new File(getDataFolder(), "stats.yml");
		this.stats = YamlConfiguration.loadConfiguration(stats1);
		File warps = new File(getDataFolder(), "warps.yml");
		if (!warps.exists())
			saveResource("warps.yml", false);
		warps1 = new File(getDataFolder(), "warps.yml");
		this.warps = YamlConfiguration.loadConfiguration(warps1);
		File arenas = new File(getDataFolder(), "arenas.yml");
		if (!arenas.exists())
			saveResource("arenas.yml", false);
		arenas1 = new File(getDataFolder(), "arenas.yml");
		this.arenas = YamlConfiguration.loadConfiguration(arenas1);
			saveResource("arenas.yml", false);
		arenas1 = new File(getDataFolder(), "arenas.yml");
		this.arenas = YamlConfiguration.loadConfiguration(arenas1);
		File lojacashvip = new File(getDataFolder(), "lojacashvip.yml");
		if (!lojacashvip.exists());
		saveResource("lojacashvip.yml", false);
		lojacashvip1 = new File(getDataFolder(), "lojacashvip1.yml");
		this.lojacashvip = YamlConfiguration.loadConfiguration(lojacashvip1);
		new BukkitRunnable() {
			@SuppressWarnings("deprecation")
			@Override
			public void run() {
				for(Player p:Bukkit.getOnlinePlayers()) {
						int ping = ((CraftPlayer)p).getHandle().ping;
						int online = Bukkit.getOnlinePlayers().length;
						TitleAPI.sendTabTitle(p, "§c§m---(-)-----------------------------------(-)---" + "\n" + "§5§lEPIC§F§lKITS§c" + "\n" + "§7➜ KitPvP Server!" + "\n" + "\n" , "§7Kit Atual: §a" + KitAPI.getKit(p) + " §7| §7Rank: " + Groups.getRank(p) + "\n" + " §7Conexao: §a" + ping + "\n" +" §7Jogadores online: §a" + online + "\n" + "\n" + "\n" + "§7Site: §FEM-BREVE" + "\n" + "§7IP: §fepic-kits.cookiehosting.net" + "\n" + "§c§m---(-)-----------------------------------(-)---");
					
				}
			}
		}.runTaskTimer(this, 0, 15);
		RegisterEvents();
		Comandos();
		Segundos1();
		Bukkit.getConsoleSender().sendMessage("§1§l-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		Bukkit.getConsoleSender().sendMessage("§a§lPlugin ATIVADO!");
		Bukkit.getConsoleSender().sendMessage("§c§lPlugin feito por : §6§lzPandaDEV");
		Bukkit.getConsoleSender().sendMessage("§b§lPlugin de KITPVP!");
		Bukkit.getConsoleSender().sendMessage("§4§lDono do servidor: Deagle");
		Bukkit.getConsoleSender().sendMessage("§1§l-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		new ScoreboardUser().runTaskTimer(this, 1, 20);
	}
	
	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("§1§l-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		Bukkit.getConsoleSender().sendMessage("§4§lPlugin DESATIVADO!");
		Bukkit.getConsoleSender().sendMessage("§b§lPlugin de KITPVP");
		Bukkit.getConsoleSender().sendMessage("§1§l-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		{
		}
		}
	
    public void saveConfiguration(File file, YamlConfiguration config){
   	 
        try{
            Writer fileWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), Charset.forName("UTF-8")));
            fileWriter.write(config.saveToString());
            fileWriter.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
 
    }
		
	public void RegisterEvents() {
		Bukkit.getServer().getPluginManager().registerEvents(new Comandos.FishermanCommand(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Gladiator(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new TagsAPI(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new PluginsEvent(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new WarpsAPI(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Urgal(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Thor(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new TimeLord(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Poseidon(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Phantom(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Camel(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new BurstMaster(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new WarpsAPI(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Warps(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new ClicktestCommand(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Ninja(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new TagCommand(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new BrokenItemEvent(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new ServerMotd(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new BuildCommand(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new AdminCommand(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new ServerSignSoup(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new ServerSignRecraft(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Stomper(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new JoinEvent(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new AllEvent(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new KillEvent(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new ServerexitEvent(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new SoupEvent(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Specialist(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Titan(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Turtle(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Deshfire(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Sonic(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Deshviper(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Seya(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Boxer(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Ryu(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Madman(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Hulk(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Forcefield(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new NerfsEvent(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new ChatEvent(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new RespawnEvent(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new KitSelector(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Kangaroo(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Fisherman(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Viper(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Snail(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Reaper(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Viking(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new YoutuberCommand(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new setArenaCommand(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Admins(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Monitor(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new VisGui(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new ManutentionCommand(), this);	
		Bukkit.getServer().getPluginManager().registerEvents(new ChatCommand(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Listeners(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new PerfilGUI(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new AplicarCommand(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new KitSelector2(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Ajnin(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Thresh(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Monk(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Magma(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Switcher(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new ServerSignVIP(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new TopKillStreak(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Rain(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Anchor(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Assassin(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Heath(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Hunter(), this);
	}
	
	public void Comandos() {
     	getCommand("TogglePvP").setExecutor(new PvPCommand());
     	getCommand("ping").setExecutor(new PingCommand());
     	getCommand("head").setExecutor(new HeadCommand());
     	getCommand("inv").setExecutor(new InvseeCommand());
     	getCommand("fps").setExecutor(new FpsCommand());
     	getCommand("sumo").setExecutor(new SumoCommand());
     	getCommand("gm").setExecutor(new GamemodeCommand());
     	getCommand("challenge").setExecutor(new ChallengeCommand());
     	getCommand("ajuda").setExecutor(new HelpCommand());
     	getCommand("main").setExecutor(new MainCommand());
     	getCommand("fisherman").setExecutor(new Comandos.FishermanCommand());
     	getCommand("tell").setExecutor(new TellCommand());
     	getCommand("warps").setExecutor(new Warps());
     	getCommand("spawn").setExecutor(new SpawnCommand());
     	getCommand("testclick").setExecutor(new ClicktestCommand());
     	getCommand("tags").setExecutor(new TagCommand());
     	getCommand("tag").setExecutor(new TagCommand());
     	getCommand("bc").setExecutor(new BroadcastCommand());
     	getCommand("coins").setExecutor(new CoinsCommand());
     	getCommand("staff").setExecutor(new StaffCommand());
     	getCommand("youtuber").setExecutor(new YoutuberCommand());
     	getCommand("tp").setExecutor(new TeleportCommand());
     	getCommand("arena").setExecutor(new CageCommand());
     	getCommand("morrer").setExecutor(new DeathCommand());
		getCommand("setarena").setExecutor(new setArenaCommand());
     	getCommand("build").setExecutor(new BuildCommand());
     	getCommand("admin").setExecutor(new AdminCommand());
     	getCommand("kit").setExecutor(new KitCommand());
     	getCommand("kits").setExecutor(new KitSelector());
     	getCommand("clearchat").setExecutor(new ClearchatCommand());
     	getCommand("report").setExecutor(new ReportCommand(getInstace()));
     	getCommand("tphere").setExecutor(new TeleportCommand());
     	getCommand("tpall").setExecutor(new TeleportCommand());
     	getCommand("admins").setExecutor(new Admins());
     	getCommand("monitorgui").setExecutor(new Monitor());
     	getCommand("monitorar").setExecutor(new MonitorCommand());
     	getCommand("vis").setExecutor(new VisCommand());
     	getCommand("invis").setExecutor(new InvisCommand());
     	getCommand("visgui").setExecutor(new VisGui());
     	getCommand("manutencao").setExecutor(new ManutentionCommand());
     	getCommand("givekit").setExecutor(new GiveKitCommand());
     	getCommand("givepermission").setExecutor(new GivePermissionCommand());
     	getCommand("skit").setExecutor(new sKitCommand());
     	getCommand("chat").setExecutor(new ChatCommand());
     	getCommand("atualizar").setExecutor(new ReloadCommand());
     	getCommand("sortearkit").setExecutor(new SorteioKitCommand());
     	getCommand("sortearvip").setExecutor(new SorteioVipCommand());
     	getCommand("promover").setExecutor(new PromoveCommand());
     	getCommand("groupset").setExecutor(new GroupSetCommand());
     	getCommand("givevip").setExecutor(new GiveVipCommand());
     	getCommand("removepermission").setExecutor(new RemovePermissionCommand());
     	getCommand("permissionslist").setExecutor(new PermissionsListCommand());
     	getCommand("score").setExecutor(new ScoreCommand());
     	getCommand("removevip").setExecutor(new RemoveVipCommand());
     	getCommand("removekit").setExecutor(new RemoveKitCommand());
     	getCommand("perfil").setExecutor(new PerfilGUI());
     	getCommand("autosoup").setExecutor(new AutoSoupCommand());
     	getCommand("aplicar").setExecutor(new AplicarCommand());
     	getCommand("kits2").setExecutor(new KitSelector2());
     	getCommand("setmotd").setExecutor(new MOTDCommand());
     	getCommand("xp").setExecutor(new GiveXpCommand());
     	getCommand("upar").setExecutor(new UpRankCommand());
     	getCommand("loja").setExecutor(new Loja());
     	getCommand("regras").setExecutor(new RegrasCommand());
     	getCommand("stafflist").setExecutor(new Staff());
	}
	public void save() {
		try {
			this.stats.save(this.stats1);
			this.warps.save(this.warps1);
			this.arenas.save(this.arenas1);
	} catch (IOException e) {
		e.printStackTrace();
	}
  }
	public static void Segundos1() {
		Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getInstace(), new Runnable() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void run() {
				for (Player s : Bukkit.getOnlinePlayers()) {
					if (KitAPI.KitDelay.containsKey(s.getName())) {
						KitAPI.KitDelay.put(s.getName(), KitAPI.KitDelay.get(s.getName()) - 1);
					}
				}
				
			}
		}, 0, 20);
	}
}
