// FoodDeliveryContent.kt
package com.exam.composedeliveryappclone.screen.home.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.exam.composedeliveryappclone.screen.home.model.CategoryData

@Composable
fun FoodDeliveryContent(modifier: Modifier = Modifier) {
    val categories = listOf(
        CategoryData("🎪", "푸드페스타"),
        CategoryData("🍔", "패스트푸드"),
        CategoryData("🍱", "한식"),
        CategoryData("☕", "카페·디저트"),
        CategoryData("🍗", "치킨"),
        CategoryData("🍲", "찜·탕"),
        CategoryData("🌭", "분식"),
        CategoryData("🍜", "중식"),
        CategoryData("🍛", "한그릇"),
        CategoryData("💙", "픽업 할인")
    )
    
    CategoryGrid(
        categories = categories,
        moreText = "음식배달",
        modifier = modifier,
        onMoreClick = { /* 더보기 클릭 처리 */ }
    )
}

@Composable
fun PickupContent(modifier: Modifier = Modifier) {
    val categories = listOf(
        CategoryData("🍔", "햄버거"),
        CategoryData("🍕", "피자"),
        CategoryData("☕", "커피"),
        CategoryData("🍰", "디저트"),
        CategoryData("🍗", "치킨"),
        CategoryData("🍜", "아시안"),
        CategoryData("🥗", "샐러드"),
        CategoryData("🌮", "멕시칸"),
        CategoryData("🍱", "도시락"),
        CategoryData("🥤", "음료")
    )
    
    CategoryGrid(
        categories = categories,
        moreText = "픽업",
        modifier = modifier,
        onMoreClick = { /* 더보기 클릭 처리 */ }
    )
}

@Composable
fun ShoppingContent(modifier: Modifier = Modifier) {
    val categories = listOf(
        CategoryData("🥬", "채소"),
        CategoryData("🍎", "과일"),
        CategoryData("🥩", "정육"),
        CategoryData("🐟", "수산"),
        CategoryData("🥛", "유제품"),
        CategoryData("🍚", "쌀·잡곡"),
        CategoryData("🥫", "가공식품"),
        CategoryData("🍪", "과자·간식"),
        CategoryData("☕", "커피·차"),
        CategoryData("🧴", "생필품")
    )
    
    CategoryGrid(
        categories = categories,
        moreText = "장보기·쇼핑",
        modifier = modifier,
        onMoreClick = { /* 더보기 클릭 처리 */ }
    )
}

@Composable
fun YearEndSpecialContent(modifier: Modifier = Modifier) {
    val categories = listOf(
        CategoryData("🎉", "연말특가"),
        CategoryData("🎁", "선물세트"),
        CategoryData("🍾", "주류"),
        CategoryData("🥩", "한우"),
        CategoryData("🦀", "해산물"),
        CategoryData("🍰", "케이크"),
        CategoryData("🍕", "파티푸드"),
        CategoryData("🎂", "베이커리"),
        CategoryData("🍫", "초콜릿"),
        CategoryData("🎊", "이벤트")
    )
    
    CategoryGrid(
        categories = categories,
        moreText = "배민연말특선",
        modifier = modifier,
        onMoreClick = { /* 더보기 클릭 처리 */ }
    )
}

@Composable
fun GiftContent(modifier: Modifier = Modifier) {
    val categories = listOf(
        CategoryData("🎁", "선물세트"),
        CategoryData("☕", "커피"),
        CategoryData("🍰", "디저트"),
        CategoryData("🥩", "한우"),
        CategoryData("🍾", "주류"),
        CategoryData("🦀", "수산"),
        CategoryData("🍎", "과일"),
        CategoryData("🎂", "케이크"),
        CategoryData("💐", "꽃"),
        CategoryData("🎊", "기프티콘")
    )
    
    CategoryGrid(
        categories = categories,
        moreText = "선물하기",
        modifier = modifier,
        onMoreClick = { /* 더보기 클릭 처리 */ }
    )
}

@Composable
fun BenefitContent(modifier: Modifier = Modifier) {
    val categories = listOf(
        CategoryData("💰", "할인쿠폰"),
        CategoryData("🎫", "포인트적립"),
        CategoryData("⭐", "첫주문할인"),
        CategoryData("🔥", "오늘의특가"),
        CategoryData("💳", "카드혜택"),
        CategoryData("🎁", "신규가입"),
        CategoryData("👥", "친구초대"),
        CategoryData("📱", "앱전용"),
        CategoryData("🏷️", "무료배달"),
        CategoryData("🎉", "이벤트")
    )
    
    CategoryGrid(
        categories = categories,
        moreText = "혜택모아보기",
        modifier = modifier,
        onMoreClick = { /* 더보기 클릭 처리 */ }
    )
}