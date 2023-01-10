package com.dce.blockchain.web.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSON;
import com.dce.blockchain.web.model.Block;
import com.dce.blockchain.web.model.Message;
import com.dce.blockchain.web.model.Transaction;
import com.dce.blockchain.web.util.BlockCache;
import com.dce.blockchain.web.util.BlockConstant;
import com.dce.blockchain.web.util.CommonUtil;

/**
 * 共识机制
 * 采用POW即工作量证明实现共识
 * @author Administrator
 *
 */
@Service
public class PowService {

	@Autowired
	BlockCache blockCache;
	
	@Autowired
	BlockService blockService;
	
	@Autowired
	P2PService p2PService;
	
	/**
	 * 通过“挖矿”进行工作量证明，实现节点间的共识
	 * 
	 * @return
	 * @throws
	 */
	public Block mine(){
		
		// 封装业务数据集合，记录区块产生的节点信息，临时硬编码实现
		List<Transaction> tsaList = new ArrayList<Transaction>();
		Transaction tsa1 = new Transaction();
		tsa1.setId("1");
		tsa1.setBusinessInfo("这是IP为："+CommonUtil.getLocalIp()+"，端口号为："+blockCache.getP2pport()+"的节点挖矿生成的区块");
		tsaList.add(tsa1);
		Transaction tsa2 = new Transaction();
		tsa2.setId("2");
		tsa2.setBusinessInfo("区块链高度为："+(blockCache.getLatestBlock().getIndex()+1));
		tsaList.add(tsa2);
		Transaction tsa3 = new Transaction();
		tsa3.setId("3");
		tsa3.setBusinessInfo("就分开了倒计时风口浪尖圣诞快乐福建省地方将诶圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解附件二欧解放路肯定是解放路看电视剧付款留点时间覅巨额偶if饥饿搜if就色of见识到了会计分录看电视剧两点上课积分吏课升斗积发吏课升斗积");
		tsaList.add(tsa3);
		Transaction tsa4 = new Transaction();
		tsa4.setId("4");
		tsa4.setBusinessInfo("就分圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解开了倒计时风口浪尖圣诞快乐福建省地方将诶附件二欧解放路肯定是解放路看电视剧付款留点时间覅巨额偶if饥饿搜if就色of见识到了会计分录看电视剧两点上课积分吏课升斗积发吏课升斗积");
		tsaList.add(tsa4);
		Transaction tsa5 = new Transaction();
		tsa5.setId("5");
		tsa5.setBusinessInfo("就分开了倒计时圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解风口浪尖圣诞快乐福建省地方将诶附件二欧解放路肯定是解放路看电视剧付款留点时间覅巨额偶if饥饿搜if就色of见识到了会计分录看电视剧两点上课积分吏课升斗积发吏课升斗积");
		tsaList.add(tsa5);
		Transaction tsa6 = new Transaction();
		tsa6.setId("6");
		tsa6.setBusinessInfo("就分开了倒计时风口圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解浪尖圣诞快乐福建省地方将诶附件二欧解放路肯定是解放路看电视剧付款留点时间覅巨额偶if饥饿搜if就色of见识到了会计分录看电视剧两点上课积分吏课升斗积发吏课升斗积");
		tsaList.add(tsa6);
		Transaction tsa7 = new Transaction();
		tsa7.setId("7");
		tsa7.setBusinessInfo("就分开了圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解倒计时风口浪尖圣诞快乐福建省地方将诶附件二欧解放路肯定是解放路看电视剧付款留点时间覅巨额偶if饥饿搜if就色of见识到了会计分录看电视剧两点上课积分吏课升斗积发吏课升斗积");
		tsaList.add(tsa7);
		Transaction tsa8 = new Transaction();
		tsa8.setId("8");
		tsa8.setBusinessInfo("就分开了倒计时风口浪尖圣诞快乐圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解福建省地方将诶附件二欧解放路肯定是解放路看电视剧付款留点时间覅巨额偶if饥饿搜if就色of见识到了会计分录看电视剧两点上课积分吏课升斗积发吏课升斗积");
		tsaList.add(tsa8);
		Transaction tsa9 = new Transaction();
		tsa9.setId("9");
		tsa9.setBusinessInfo("就分开了倒计时风口浪尖圣诞快圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解乐福建省地方将诶附件二欧解放路肯定是解放路看电视剧付款留点时间覅巨额偶if饥饿搜if就色of见识到了会计分录看电视剧两点上课积分吏课升斗积发吏课升斗积");
		tsaList.add(tsa9);
		Transaction tsa10 = new Transaction();
		tsa10.setId("10");
		tsa10.setBusinessInfo("10就分开了倒计时风口浪尖圣诞快乐圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解圣诞快乐福建省地方将诶附件二欧解福建省地方将诶附件二欧解放路肯定是解放路看电视剧付款留点时间覅巨额偶if饥饿搜if就色of见识到了会计分录看电视剧两点上课积分吏课升斗积发吏课升斗积");
		tsaList.add(tsa10);

		// 定义每次哈希函数的结果
		String newBlockHash = "";
		int nonce = 0;
		long start = System.currentTimeMillis();
		System.out.println("开始挖矿");
		while (true) {
			// 计算新区块hash值
			newBlockHash = blockService.calculateHash(blockCache.getLatestBlock().getHash(), tsaList, nonce);
			// 校验hash值
			if (blockService.isValidHash(newBlockHash)) {
				System.out.println("挖矿完成，正确的hash值：" + newBlockHash);
				System.out.println("挖矿耗费时间：" + (System.currentTimeMillis() - start) + "ms");
				break;
			}
			System.out.println("第"+(nonce+1)+"次尝试计算的hash值：" + newBlockHash);
			nonce++;
		}
		// 创建新的区块
		Block block = blockService.createNewBlock(nonce, blockCache.getLatestBlock().getHash(), newBlockHash, tsaList);
		
		//创建成功后，全网广播出去
		Message msg = new Message();
		msg.setType(BlockConstant.RESPONSE_LATEST_BLOCK);
		msg.setData(JSON.toJSONString(block));
		p2PService.broatcast(JSON.toJSONString(msg));
		
		return block;
	}
	
}
