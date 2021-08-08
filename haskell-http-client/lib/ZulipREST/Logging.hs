{-
   Zulip REST API

   Powerful open source group chat 

   OpenAPI Version: 3.0.1
   Zulip REST API API version: 1.0.0
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : ZulipREST.Logging
Logging functions
-}
{-# LANGUAGE CPP #-}

#ifdef USE_KATIP

module ZulipREST.Logging
  ( module ZulipREST.LoggingKatip
  ) where

import ZulipREST.LoggingKatip

#else

module ZulipREST.Logging
  ( module ZulipREST.LoggingMonadLogger
  ) where

import ZulipREST.LoggingMonadLogger

#endif
