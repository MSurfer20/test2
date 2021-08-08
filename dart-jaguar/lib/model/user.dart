import 'package:jaguar_serializer/jaguar_serializer.dart';


import 'package:openapi/model/user_base.dart';

import 'package:openapi/model/user_all_of.dart';

part 'user.jser.dart';

class User {
  
  @Alias('email', isNullable: true,  )
  final Object email;
  
  @Alias('is_bot', isNullable: true,  )
  final Object isBot;
  
  @Alias('avatar_url', isNullable: true,  )
  final Object avatarUrl;
  
  @Alias('avatar_version', isNullable: true,  )
  final Object avatarVersion;
  
  @Alias('full_name', isNullable: true,  )
  final Object fullName;
  
  @Alias('is_admin', isNullable: true,  )
  final Object isAdmin;
  
  @Alias('is_owner', isNullable: true,  )
  final Object isOwner;
  
  @Alias('is_billing_admin', isNullable: true,  )
  final Object isBillingAdmin;
  
  @Alias('role', isNullable: true,  )
  final Object role;
  
  @Alias('bot_type', isNullable: true,  )
  final Object botType;
  
  @Alias('user_id', isNullable: true,  )
  final Object userId;
  
  @Alias('bot_owner_id', isNullable: true,  )
  final Object botOwnerId;
  
  @Alias('is_active', isNullable: true,  )
  final Object isActive;
  
  @Alias('is_guest', isNullable: true,  )
  final Object isGuest;
  
  @Alias('timezone', isNullable: true,  )
  final Object timezone;
  
  @Alias('date_joined', isNullable: true,  )
  final Object dateJoined;
  
  @Alias('delivery_email', isNullable: true,  )
  final Object deliveryEmail;
  
  @Alias('profile_data', isNullable: true,  )
  final Object profileData;
  

  User(
      

{
     this.email = null,  
     this.isBot = null,  
     this.avatarUrl = null,  
     this.avatarVersion = null,  
     this.fullName = null,  
     this.isAdmin = null,  
     this.isOwner = null,  
     this.isBillingAdmin = null,  
     this.role = null,  
     this.botType = null,  
     this.userId = null,  
     this.botOwnerId = null,  
     this.isActive = null,  
     this.isGuest = null,  
     this.timezone = null,  
     this.dateJoined = null,  
     this.deliveryEmail = null,  
     this.profileData = null 
    
    }
  );

  @override
  String toString() {
    return 'User[email=$email, isBot=$isBot, avatarUrl=$avatarUrl, avatarVersion=$avatarVersion, fullName=$fullName, isAdmin=$isAdmin, isOwner=$isOwner, isBillingAdmin=$isBillingAdmin, role=$role, botType=$botType, userId=$userId, botOwnerId=$botOwnerId, isActive=$isActive, isGuest=$isGuest, timezone=$timezone, dateJoined=$dateJoined, deliveryEmail=$deliveryEmail, profileData=$profileData, ]';
  }
}

@GenSerializer(nullableFields: true)
class UserSerializer extends Serializer<User> with _$UserSerializer {

}

