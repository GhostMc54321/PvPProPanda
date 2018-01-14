package Comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import Utilidades.KitAPI;

public class KitCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§cVocê Não Pode usar isso No Console!");
			return true;
		}
		Player p = (Player)sender;
		if (args.length == 0) {
			p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Use isso De Maneira Correta: §f/kit <kit> ou /kits");
			return true;
		} else {
			if (args[0].equalsIgnoreCase("pvp")) {
				if (p.hasPermission("kit.pvp")) {
					if (KitAPI.getKit(p) == "Nenhum" ) {
						KitAPI.PvP(p);
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fPvP");
						return true;
						
					} else {
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
						return true;
					}
					
				} else {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
					return true;
				}
			}
			if (args[0].equalsIgnoreCase("hunter")) {
				if (p.hasPermission("kit.hunter")) {
					if (KitAPI.getKit(p) == "Nenhum" ) {
						KitAPI.hunter(p);
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fHunter");
						return true;
						
					} else {
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
						return true;
					}
					
				} else {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
					return true;
				}
			}
			if (args[0].equalsIgnoreCase("health")) {
				if (p.hasPermission("kit.health")) {
					if (KitAPI.getKit(p) == "Nenhum" ) {
						KitAPI.Health(p);
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fHealth");
						return true;
						
					} else {
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
						return true;
					}
					
				} else {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
					return true;
				}
			}
			if (args[0].equalsIgnoreCase("assassin")) {
				if (p.hasPermission("kit.assassin")) {
					if (KitAPI.getKit(p) == "Nenhum" ) {
						KitAPI.Assassin(p);
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fAssassin");
						return true;
						
					} else {
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
						return true;
					}
					
				} else {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
					return true;
				}
			}
			if (args[0].equalsIgnoreCase("kangaroo")) {
				if (p.hasPermission("kit.kangaroo")) {
					if (KitAPI.getKit(p) == "Nenhum" ) {
						KitAPI.Kangaroo(p);
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fKangaroo");
						return true;
						
					} else {
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
						return true;
					}
					
				} else {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
					return true;
				}
			}
			if (args[0].equalsIgnoreCase("anchor")) {
				if (p.hasPermission("kit.anchor")) {
					if (KitAPI.getKit(p) == "Nenhum" ) {
						KitAPI.Anchor(p);
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fAnchor");
						return true;
						
					} else {
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
						return true;
					}
					
				} else {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
					return true;
				}
			}
			if (args[0].equalsIgnoreCase("rain")) {
				if (p.hasPermission("kit.rain")) {
					if (KitAPI.getKit(p) == "Nenhum" ) {
						KitAPI.Rain(p);
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fRain");
						return true;
						
					} else {
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
						return true;
					}
					
				} else {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
					return true;
				}
			}
			if (args[0].equalsIgnoreCase("switcher")) {
				if (p.hasPermission("kit.switcher")) {
					if (KitAPI.getKit(p) == "Nenhum" ) {
						KitAPI.Switcher(p);
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fSwitcher");
						return true;
						
					} else {
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
						return true;
					}
					
				} else {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
					return true;
				}
			}
			if (args[0].equalsIgnoreCase("thresh")) {
				if (p.hasPermission("kit.thresh")) {
					if (KitAPI.getKit(p) == "Nenhum" ) {
						KitAPI.Thresh(p);
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fThresh");
						return true;
						
					} else {
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
						return true;
					}
					
				} else {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
					return true;
				}
			}
			if (args[0].equalsIgnoreCase("magma")) {
				if (p.hasPermission("kit.magma")) {
					if (KitAPI.getKit(p) == "Nenhum" ) {
						KitAPI.magma(p);
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §FMAGMA");
						return true;
						
					} else {
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
						return true;
					}
					
				} else {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
					return true;
				}
			}
			if (args[0].equalsIgnoreCase("viper")) {
				if (p.hasPermission("kit.viper")) {
					if (KitAPI.getKit(p) == "Nenhum" ) {
						KitAPI.Viper(p);
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fViper");
						return true;
						
					} else {
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
						return true;
					}
					
				} else {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
					return true;
				}
			}
			if (args[0].equalsIgnoreCase("monk")) {
				if (p.hasPermission("kit.monk")) {
					if (KitAPI.getKit(p) == "Nenhum" ) {
						KitAPI.Monk(p);
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §FMonk");
						return true;
						
					} else {
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
						return true;
					}
					
				} else {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
					return true;
				}
			}
				if (args[0].equalsIgnoreCase("Snail")) {
					if (p.hasPermission("kit.snail")) {
						if (KitAPI.getKit(p) == "Nenhum" ) {
							KitAPI.Snail(p);
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fSnail");
							return true;
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
							return true;
						}
						
					} else {
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
						return true;
					}
				}
				if (args[0].equalsIgnoreCase("Reaper")) {
					if (p.hasPermission("kit.reaper")) {
						if (KitAPI.getKit(p) == "Nenhum" ) {
							KitAPI.Reaper(p);
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fReaper");
							return true;
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
							return true;
						}
						
					} else {
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
						return true;
					   }
					}
					if (args[0].equalsIgnoreCase("Fisherman")) {
						if (p.hasPermission("kit.fisherman")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Fisherman(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fFisherman");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
						    }
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Stomper")) {
						if (p.hasPermission("kit.stomper")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Stomper(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fStomper");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
						    }
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Viking")) {
						if (p.hasPermission("kit.viking")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Vinking(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fViking");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
						    }
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Ninja")) {
						if (p.hasPermission("kit.ninja")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Ninja(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fNinja");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
						    }
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Boxer")) {
						if (p.hasPermission("kit.Boxer")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Boxer(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fBoxer");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
						    }
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Deshfire")) {
						if (p.hasPermission("kit.Deshfire")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Deshfire(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fDeshfire");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
						    }
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Deshviper")) {
						if (p.hasPermission("kit.Deshviper")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Deshviper(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fDeshviper");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
						    }
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Forcefield")) {
						if (p.hasPermission("kit.Forcefield")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Forcefield(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fForcefield");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
						    }
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Hulk")) {
						if (p.hasPermission("kit.Hulk")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Hulk(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fHulk");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
						    }
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Madman")) {
						if (p.hasPermission("kit.Madman")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Madman(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fMadman");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
						    }
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Ryu")) {
						if (p.hasPermission("kit.Ryu")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Ryu(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fRyu");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
						    }
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Seya")) {
						if (p.hasPermission("kit.Seya")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Seya(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fSeya");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
						    }
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Sonic")) {
						if (p.hasPermission("kit.Sonic")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Sonic(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fSonic");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
						    }
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Specialist")) {
						if (p.hasPermission("kit.Specialist")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.specialist(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fSpecialist");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
						    }
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Titan")) {
						if (p.hasPermission("kit.Titan")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Titan(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fTitan");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
						    }
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Turtle")) {
						if (p.hasPermission("kit.Turtle")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Turtle(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fTurtle");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
						    }
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Urgal")) {
						if (p.hasPermission("kit.urgal")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Urgal(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fUrgal");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
						    }
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Thor")) {
						if (p.hasPermission("kit.Thor")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Thor(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fThor");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
						    }
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("TimeLord")) {
						if (p.hasPermission("kit.TimeLord")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.TimeLord(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fTimeLord");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
						    }
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("QuickDropper")) {
						if (p.hasPermission("kit.QuickDropper")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.quickdropper(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fQuickDropper");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
						    }
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Poseidon")) {
						if (p.hasPermission("kit.poseidon")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Poseidon(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fPoseidon");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
						    }
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Phantom")) {
						if (p.hasPermission("kit.phantom")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Phantom(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fPhantom");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
						    }
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Camel")) {
						if (p.hasPermission("kit.Camel")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Camel(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fCamel");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
						    }
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("BurstMaster")) {
						if (p.hasPermission("kit.BurstMaster")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.BurstMaster(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fBurstMaster");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
						    }
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Gladiator")) {
						if (p.hasPermission("kit.Gladiator")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Gladiator(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fGladiator");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
						    }
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Ajnin")) {
						if (p.hasPermission("kit.ajnin")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Ajnin(p);
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê selecionou o kit §fAjnin");
								return true;
								
							} else {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Já esta usando Um §fKIT§c, Remova-o e Tente Novamente");
								return true;
							}
							
						} else {
							p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para este §fKIT§c!");
							return true;
						}
					}
			p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cO Kit §f" + args[0] + " §cNão Foi Encontrado!");
			
		      }    		
		return false;
	}
  }