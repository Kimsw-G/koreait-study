import discord
import asyncio

client = discord.Client()

@client.event
async def on_ready():
	print("discord bot login")
	print("discord bot's name : " + client.user.name)
	print("discord bot's ver : " + str(discrod.__version__))
	print("---------")
	await client.change_presence(status=discord.Status.online, activity=discord.Game("서술"))
	
@client.event
async def on_message(message):
	content = message.content
	guild = message guild
	author = message.author
	channel = message.channel
	if content.startswitch("!test"):
		await message.channel.send("test" + message.content)
	if content == "!ping":
		await message.channel.send("Pong")
		
client.run('820889796145971221')